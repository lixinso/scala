FROM hseeberger/scala-sbt:8u222_1.3.5_2.13.1 
#RUN apt update
#RUN apt upgrade -y
RUN apt install -y wget
RUN apt install -y vim

#RUN pip3 install pandas

RUN mkdir /myworkdir
VOLUME ["/myworkdir"]
WORKDIR /myworkdir


CMD ["/bin/bash"]
