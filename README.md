HabitRPGAndroidWrapper
======================

An android library to interact with HabitRPG.

This library relies on Retrofit, and allows you to send every requests in background, while relying on Callbacks to do your job on the UI thread.
To use it, there is a simple class called HabitRPGInteractor, which will help you work with the API.

You can create your own callbacks, based on the one proposed in the com.magicmickyhabitrpgwrapper.lib.api package.


Enjoy :)


##Importing the library
Add this library to your project's build.gradle dependencies.
```
    dependencies {
        //...
        compile 'com.magicmicky.habitrpgwrapper.lib:lib:+'
    }
```


##Using the library

```
    HabitRPGInteractor hrpg = new HabitRPGInteractor(api, user);
    hrpg.getStatus(new StatusCallback());
```


