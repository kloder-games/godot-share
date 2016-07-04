package org.godotengine.godot;

import android.app.Activity;
import android.util.Log;
import android.content.Intent;

public class GodotShare extends Godot.SingletonBase
{
	private Activity activity = null; // The main activity of the game

	/* Methods
	 * ********************************************************************** */

	/**
	 * Share method
	 * @param String text The text to share with Intent (for example: "Hey check out my app at: https://play.google.com/store/apps/details?id=com.google.android.apps.plus")
	 */
	public void share(final String text)
	{
		activity.runOnUiThread(new Runnable()
		{
			@Override public void run()
			{
				Intent sendIntent = new Intent();
				sendIntent.setAction(Intent.ACTION_SEND);
				sendIntent.putExtra(Intent.EXTRA_TEXT, text);
				sendIntent.setType("text/plain");
				activity.startActivity(sendIntent);
				Log.d("godot", "Share: start Intent with '" + text + "'.");
			}
		});
	}

	/* Definitions
	 * ********************************************************************** */

	/**
	 * Initilization Singleton
	 * @param Activity The main activity
	 */
 	static public Godot.SingletonBase initialize(Activity activity)
 	{
 		return new GodotShare(activity);
 	}

	/**
	 * Constructor
	 * @param Activity Main activity
	 */
	public GodotShare(Activity activity) {
		registerClass("GodotShare", new String[] {
			"share"
		});
		this.activity = activity;
	}
}
