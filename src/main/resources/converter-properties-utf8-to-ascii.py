#!/usr/bin/python
__author__ = 'dzmitry'

import os

current_dir = os.getcwd()
files = os.listdir(current_dir)
for file in files:
    if os.path.isdir(file) or not file.endswith(".utf"):
        continue
    prefix = file[:-4]
    print(prefix)
    os.system("native2ascii -encoding utf8 %s.utf %s.properties" % (prefix, prefix))
