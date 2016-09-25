# vectorview

### Android Pre-L Vector Support For TextView, EditText, Button

### Usage

```gradle
dependencies {
    ...
    compile 'com.bsobe:vectorview:0.1.0'
}
```

### Note: If your project min-sdk is under API-16, add this line to AndroidManifest.xml
```xml
<uses-sdk tools:overrideLibrary="com.bsobe.vectorview" />
```


Usage of Drawable
```xml
<?xml version="1.0" encoding="utf-8"?>
<com.bsobe.vectorview.VectorTextView
            ...
            app:drawableBottom="@drawable/ic_down_black_24"
            app:drawableLeft="@drawable/ic_left_black_24"
            app:drawableRight="@drawable/ic_right_black_24"
            app:drawableTop="@drawable/ic_up_black_24" />

Usage of Tint

<?xml version="1.0" encoding="utf-8"?>
<com.bsobe.vectorview.VectorTextView
            ...
            app:drawableBottom="@drawable/ic_down_black_24"
            app:drawableTint="@color/colorAccent"/>
```

Look [Sample projects] [sample] for more information

### License

Copyright 2016 Barış Söbe

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.

[sample]: <https://github.com/bsobe/vectorview/tree/master/app>
