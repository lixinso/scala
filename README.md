# Scala language

will be public repo


# Install on Mac

- Install JDK 11

https://www.scala-lang.org/download/

- Install IDE

brew install sbt



# References

- https://www.scala-lang.org/

# Docker

```
$ docker build  --platform linux/amd64  --tag sample-scala-x86:1.0 .
$ docker run  --platform linux/amd64 -v `pwd`:/myworkdir  --rm -it --name sample-scala-x86 sample-scala-x86:1.0


$ docker build --tag sample-scala-arm:1.0 .
$ docker run -v `pwd`:/myworkdir  --rm -it --name sample-scala-arm sample-scala-arm:1.0

#python3 main.py
```

dpkg --print-architecture


https://hub.docker.com/r/hseeberger/scala-sbt/
