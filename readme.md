This project demonstrate simple impelementation of RecyclerView and Retrofit libraries.

Highlights:
- Displays a list of 20 random users with name, email and picture, in RecyclerView
- randomuser.me api is used for getting the data
- Model's classes code is created using jsonschema2pojo.org for fast and direct creation
- Additionally, Picasso library is also used for downloading the image from the URL and loading it and into the ImageViews
- CircularImageView is also used to display image in each item of RecyclerView cropped in a circle

Libraries/components used:
- RecyclerView
- Retrofit
- Picasso
- CircularImageView

Installing external libraries into project
- Open app/build.gradle file
- Modify dependencies block by adding below lines in the end of it:

		dependencies{
			...
			compile 'com.google.code.gson:gson:2.7'
			compile 'com.squareup.retrofit2:retrofit:2.1.0'
			compile 'com.squareup.retrofit2:converter-gson:2.1.0'
			compile 'com.squareup.picasso:picasso:2.5.2'
			compile 'com.android.support:support-v4:25.1.1'
			compile 'com.android.support:recyclerview-v7:25.1.1'
			compile 'de.hdodenhof:circleimageview:2.1.0'
		}
	
- Click on 'Sync Now'
