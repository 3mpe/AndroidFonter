# AndroidFonter

## How to install 

```Groovy
repositories {
    mavenCentral()
    maven { url "https://jitpack.io" }
}

dependencies {
  compile 'com.github.3mpe:AndroidFonter:1.0.0'
}
```
###### Copy fonts to assets folder `assets/fonts`
 minSdkVersion 19

###### example xml file
````Groovy
    <com.example.a3mpe.typefacefonter.CustomButton
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        android:text="click me" 
        fontName="Dosis-Bold.ttf"/>
        
    <com.example.a3mpe.typefacefonter.CustomCheckBox
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        android:text="click me" 
        fontName="Dosis-Bold.ttf"/>
     
     <com.example.a3mpe.typefacefonter.CustomEditText
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        android:text="click me" 
        fontName="Dosis-Bold.ttf"/>
          
     <com.example.a3mpe.typefacefonter.CustomFontTextView
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        android:text="click me" 
        fontName="Dosis-Bold.ttf"/>
          
     <com.example.a3mpe.typefacefonter.CustomRadioButton
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        android:text="click me" 
        fontName="Dosis-Bold.ttf"/>
````
