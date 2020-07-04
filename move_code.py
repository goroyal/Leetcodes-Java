#!/usr/bin/env python
import re
import os
import shutil
from os import listdir
from os.path import isdir, exists

src = '/src/main/java/'
test = 'src/test/java/'
target_module = 'Solution'
original_source_name = 'Solution.java'
original_test_name = 'SolutionTest.java'
readme = 'README.md'
module_regex = re.compile(r'\d\d.*')
sub_dirs = [d for d in os.listdir('.') if os.path.isdir(d) and module_regex.search(d)]
for dir in sub_dirs:
    original_source_path = dir + src + original_source_name
    original_test_path = dir + src + original_test_name
    original_readme_path = dir + "/" + readme

    exist_source = exists(original_source_path)
    exist_test = exists(original_test_path)
    exist_readme = exists(original_readme_path)
    if exist_test:
        new_test_name = ('_' + dir).replace('.', '') + 'Test.java'
        new_test_path = target_module + src + new_test_name
        shutil.move(original_test_path, new_test_path)
    if exist_readme:
        new_readme_name = dir + ".md"
        shutil.move(original_readme_path, 'Notes/' + new_readme_name)
    if exist_source:
        new_source_name = ('_' + dir).replace('.', '') + '.java'
        new_source_path = target_module + src + new_source_name
        shutil.move(original_source_path, new_source_path)
        shutil.rmtree(dir)
