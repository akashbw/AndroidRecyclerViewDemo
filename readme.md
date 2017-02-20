This project demonstrate simple impelementation of RecyclerView and Retrofit libraries.

Highlights:
1. Displays a list of 20 random users with name, email and picture, in RecyclerView
2. randomuser.me api is used for getting the data
3. Model's classes code is created using jsonschema2pojo for fast and direct creation
4. Additionally, Picasso library is also used for downloading the image from the URL and loading it and into the ImageViews
5. CircularImageView is also used to display image in each item of RecyclerView cropped in a circle

Libraries/components used:
1. RecyclerView
2. Retrofit
3. Picasso
4. CircularImageView

Installing external libraries into project
1. Open app/build.gradle file
2. Modify dependencies block by adding below lines in the end of it:

	   dependecies{
			...
			compile 'com.google.code.gson:gson:2.7'
	    	compile 'com.squareup.retrofit2:retrofit:2.1.0'
		    compile 'com.squareup.retrofit2:converter-gson:2.1.0'
	    	compile 'com.squareup.picasso:picasso:2.5.2'
	    	compile 'com.android.support:support-v4:25.1.1'
	    	compile 'com.android.support:recyclerview-v7:25.1.1'
	    	compile 'de.hdodenhof:circleimageview:2.1.0'
		}
3. Click on 'Sync Now'
