def numbers(file):
    with open(file, 'r') as f:
        names = []
        for line in f:
            line = line.strip()
            if line.isdigit():
                names.append(int(line))
        f.close()
    return names


for n in range(5, 51, 5):
    for type in ["array","bst"]:
        names = numbers(f"/home/celimpilo/Documents/CSC2001F/Assignments/Assignment1/files/data/{type}_{n}.txt")
        if type == "array":
            print(f"When n is(array) {n}")
            print("min: ", min(names))
            print("max: ", max(names))
            print("average: ", sum(names)/len(names))
            print()
        else:
            print(f"When n is(bst) {n}")
            print("min: ", min(names))
            print("max: ", max(names))
            print("average: ", sum(names)/len(names))
            print()
