Share
=====
This is the Share module for Godot Engine (https://github.com/okamstudio/godot)
- Android only
- Share text
 
How to use
----------
Drop the "share" directory inside the "modules" directory on the Godot source.

Recompile android export template (For documentation: http://docs.godotengine.org/en/latest/reference/compiling_for_android.html#compiling-export-templates).


In Example project goto Export > Target > Android:

	Options:
		Custom Package:
			- place your apk from build
		Permissions on:
			- Access Network State
			- Internet

Configuring your game
---------------------

To enable the module on Android, add the path to the module to the "modules" property on the [android] section of your engine.cfg file. It should look like this:

	[android]
	modules="org/godotengine/godot/GodotShare"

If you have more separate by comma.

API Reference
-------------

The following methods are available:
```python

# Share method
# @param String text The text to share with Intent (for example: "Hey check out my app at: https://play.google.com/store/apps/details?id=com.google.android.apps.plus")
share(text)
```

References
-------------
Based on the stackoverflow info:
* http://stackoverflow.com/questions/13941093/how-to-share-entire-android-app-with-share-intent

License
-------------
MIT license


