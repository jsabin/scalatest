FROM sbtscala/scala-sbt:eclipse-temurin-21.0.5_11_1.10.7_2.13.16

USER sbtuser

WORKDIR /home/sbtuser

ENTRYPOINT "/bin/bash"