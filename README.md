# gradle-sample
This is a sample Gradle project for testing CI capabilities.

## Usage

1. (Optional) If you want to use a Gradle version different from [what is used in this project](gradle/wrapper/gradle-wrapper.properties#L3), create new wrapper infrastructure by running:

```
gradle wrapper
```

or

```
gradle wrapper --gradle-version <version>
```

2. Build/test using wrapper:

```
./gradlew clean test
```

dummy text