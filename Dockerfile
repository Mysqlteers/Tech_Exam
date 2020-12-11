FROM ubuntu

RUN /bin/bash -c 'echo This would be nice'
ENV mySafespace="This is a sample" \
    otherSafespace="Me too"