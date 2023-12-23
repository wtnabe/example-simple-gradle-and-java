## Dead Simple Gradle and Java Project example

What I did.

 1. Install gradle somehow ( ex: Homebrew )
 2. gradle init
 3. write code
 4. java src/main/java/Hello.java
 5. ./gradlew build
 6. java -jar build/libs/example-dead-simple-java.jar
 7. pack build \<project\> -D hello -B gcr.io/buildpacks/builder:google-22
 8. docker run --rm hello
 9. docker tag && docker push
 10. gcloud run jobs deploy \<job\> --image \<image\>
 11. gcloud run jobs execute \<job\>
