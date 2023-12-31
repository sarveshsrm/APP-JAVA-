def generate_fibonacci(n):
    fibonacci_sequence = [0, 1]
    while len(fibonacci_sequence) < n:
        next_number = fibonacci_sequence[-1] + fibonacci_sequence[-2]
        fibonacci_sequence.append(next_number)
    return fibonacci_sequence

n = int(input("Enter the number of Fibonacci numbers to generate: "))

fibonacci_sequence = generate_fibonacci(n)
print("Fibonacci Sequence:", fibonacci_sequence)
