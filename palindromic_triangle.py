n = int(input("Enter the number of rows: "))

for i in range(1, n + 1):
    print(" " * (n - i), end="")  # Print spaces for alignment
    print("".join(str(j) for j in range(1, i + 1)) + "".join(str(j) for j in range(i - 1, 0, -1)))
