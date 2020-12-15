FROM python:3
RUN apt update
RUN apt upgrade -y
RUN apt install -y wget
RUN apt install -y vim

RUN pip3 install pandas

RUN mkdir /myworkdir
VOLUME ["/myworkdir"]
WORKDIR /myworkdir

COPY ./main.py .
COPY ./second.py .

CMD ["/bin/bash"]
