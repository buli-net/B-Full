# B-Lite local source integration

This source package combines the B-Lite project with source modules made from the library
sources supplied in this conversation. The AndroidX module code/resources are from the
provided `androidx-main` repository snapshot, not from a tagged AndroidX release.

## Local source modules

- `bitcoinj-core`: bitcoinj 0.17.1
- `bcprov-source`: Bouncy Castle 1.83
- `guava-source`: Guava 33.7.2-android source
- `protobuf-lite-source`: Protobuf Java Lite 4.36.2 source
- `slf4j-api-source` and `slf4j-android-source`: SLF4J 2.0.17
- `zxing-core-source`: ZXing Core 3.4.1 source
- `zxing-android-embedded-local`: ZXing Android Embedded 4.3.0 source
- `androidx-activity-local`, `androidx-core-local`, `androidx-appcompat-local`,
  `androidx-appcompat-resources-local`, `androidx-recyclerview-local`,
  `androidx-swiperefreshlayout-local`

VersionedParcelable and its annotation processor are also built from the supplied source snapshot, avoiding a processor coordinate that AndroidX itself marks as unpublished. These source modules are wired by `settings.gradle` and `project(...)` dependencies. Maven
artifacts for those exact classes are excluded to prevent the same library classes being
loaded twice. The local Core source includes its current main-branch Kotlin extensions, so the
old Core KTX artifact is excluded too. `androidx-core-local` consumes local Guava rather than
the separate `listenablefuture` artifact.

## Temporary online dependencies

AndroidX Annotation, Lifecycle, SavedState, Fragment, Collection, CursorAdapter, DrawerLayout,
Emoji2, VectorDrawable, ResourceInspection, ProfileInstaller, Tracing, Interpolator, CustomView,
NavigationEvent, ConcurrentFutures, Kotlin Coroutines, Guava FailureAccess, and annotation-only
support libraries remain online Maven dependencies. Some source for these exists in the supplied
large AndroidX repository snapshot, but certain modules use multiplatform source sets, generated
code, or AndroidX-specific build conventions and have not yet been converted to standalone local
Gradle modules that can be verified here. They have intentionally not been removed from Maven.

## Build status

Gradle wrapper: 9.6.0. Android Gradle Plugin: 9.4.0 with built-in Kotlin enabled. Compile SDK: 37. JDK target: 17.
The AndroidX sources are from a moving main-branch snapshot. ZIP structure and source/module
wiring were checked, but a Release build is not claimed as successful. Verify in an environment
with the Android SDK/API 37 and Maven access by running `./gradlew clean assembleRelease`.
