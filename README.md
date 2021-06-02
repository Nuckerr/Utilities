# Utilities
A bunch of useful utilities, fully documented (in javadocs), for you to use in your spigot plugins

To understand the meaning of each method/variable and how to use it, either read through the javadocs in the file or IntelliSense

# IMPORTANT
If you plan to use the `ClockUtils.java` class, go through and everwhere it says the following, replace it with an instance of your main class:

```
/* Your plugin here */  Bukkit.getServer().getPluginManager().getPlugin("YourPlugin")
```

# Contributing
Guidelines:
  - Use `this` keyword when possible
  - If you are calling a static object provide the class its from even if its in the same class
  - Try to add javadocs to your contributions / update them. If you havent, please let me know in the pr
  - You can test it in your own plugin. ONLY COMMIT THE UTILS CLASSES

TODO:
  - BuildUtils for easily creating cubes, squares, circles, cylenders and anything else you might find usful in this
  - WorldUtils for easily managing worlds eg creating, deleting, renaming etc.
