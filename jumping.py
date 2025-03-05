def is_jumping(num):
    num_str = str(num)
    
    
    if len(num_str) <= 1:
        return True
    

    for i in range(len(num_str)-1):
        if abs(int(num_str[i]) - int(num_str[i+1])) != 1:
            return False
    return True

def find_largest_jumping(x):
    for num in range(x, -1, -1):
        if is_jumping(num):
            return num
    return 0

def main():
    test_cases = [50, 75, 100, 110, 23,1180]
    
    for x in test_cases:
        result = find_largest_jumping(x)
        print(f"Largest jumping number <= {x} is: {result}")

if __name__ == "__main__":
    main()