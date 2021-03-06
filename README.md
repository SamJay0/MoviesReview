# Popular Movies Review
Get a review of latest popular movies.
MoviesReview app development in progress, consumes https://www.themoviedb.org/ REST APIs to fetch popular movies and their info, built on [Android Architecture Components](https://developer.android.com/topic/libraries/architecture) and [MVVM Architecture](https://developer.android.com/jetpack/docs/guide).

# APK
[MoviesReview app APK](app/debug/app-debug.apk)

# Screenshots
<image src="screenshots/1.png" width="200"><image src="screenshots/2.png" width="200"><image src="screenshots/3.png" width="200"><image src="screenshots/4.png" width="200"><image src="screenshots/5.png" width="200">

Libraries Used
--------------
* [Architecture][1] - A collection of libraries that help you design robust, testable, and
  maintainable apps. Start with classes for managing your UI component lifecycle and handling data
  persistence.
  * [Data Binding][2] - Declaratively bind observable data to UI elements.
  * [Lifecycles][3] - Create a UI that automatically responds to lifecycle events.
  * [LiveData][4] - Build data objects that notify views when the underlying database changes.
  * [Navigation][5] - Handle everything needed for in-app navigation.
  * [Room][6] - Access app's SQLite database with in-app objects and compile-time checks.
  * [ViewModel][7] - Store UI-related data that isn't destroyed on app rotations.
  * [WorkManager][8] - Manage your Android background jobs.
* Third party
  * [Retrofit][9] - A type-safe HTTP client for Android and Java
  * [Moshi][10] - A modern JSON library for Android and Java. It makes it easy to parse JSON into Java objects
  * [Glide][11] for image loading
  * [Kotlin Coroutines][12] for managing background threads with simplified code and reducing needs for callbacks

[1]: https://developer.android.com/jetpack/arch/
[2]: https://developer.android.com/topic/libraries/data-binding/
[3]: https://developer.android.com/topic/libraries/architecture/lifecycle
[4]: https://developer.android.com/topic/libraries/architecture/livedata
[5]: https://developer.android.com/topic/libraries/architecture/navigation/
[6]: https://developer.android.com/topic/libraries/architecture/room
[7]: https://developer.android.com/topic/libraries/architecture/viewmodel
[8]: https://developer.android.com/topic/libraries/architecture/workmanager
[9]: https://square.github.io/retrofit/
[10]: https://github.com/square/moshi
[11]: https://bumptech.github.io/glide/
[12]: https://kotlinlang.org/docs/reference/coroutines-overview.html