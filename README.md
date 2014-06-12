HabitRPGAndroidWrapper
======================

An android library to interact with HabitRPG. Relies on retrofit.


I'll detail a bit more later how it works. But to be brief, here is an example.

```
        RequestInterceptor requestInterceptor = new RequestInterceptor() {
            @Override
            public void intercept(RequestInterceptor.RequestFacade request) {
                request.addHeader("x-api-key", "b89ef880-7e07-4d13-8a5f-b6be25437fd8");
                request.addHeader("x-api-user","710f41f1-4113-4d8a-9714-79a84edd6175");
            }
        };

        RestAdapter adapter = new RestAdapter.Builder().setEndpoint("https://habitrpg.com:443/api/v2/").setRequestInterceptor(requestInterceptor).build();

        ApiService service  = adapter.create(ApiService.class);
        service.getStatus(new StatusCallback());
```
Now you can use service to call any action you want.

**Note :** For the callback, I advice you to create your own. They are supposed to implement the retrofit's Callback interface.
Just check the interface examples in `com.magicmicky.habitrpgwrapper.lib.api`.

I'm going to deliver a proper interface, so that you can work out of it and not use retrofit's interface directly.

Enjoy :)
