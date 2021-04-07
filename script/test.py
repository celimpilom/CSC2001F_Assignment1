import random
import os

def openList(file):
    with open(file, 'r') as f:
        names = []
        for line in f:
            id = line.split(" ")[0]
            names.append(id)
        f.close()
    return names

def tester(names):
    for n in range(5, 51, 5):
        list = random.sample(names, n)
        for type in ['array', 'bst']:
            for student in list:
                os.system(f"make run{type} stdN={student} >> files/data/{type}_{n}.txt")

if __name__ == "__main__":
    names = openList('files/oklist.txt')
    tester(names)