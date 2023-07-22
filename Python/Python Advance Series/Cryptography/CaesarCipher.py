def encrypt(text, key):
    result = ""
    for char in text:
        if char.isalpha():  # Check if the character is a letter
            shift = ord('a') if char.islower() else ord('A')  # Determine the shift value based on lowercase or uppercase
            # Encrypt the character using the standard alphabet series and the key
            encrypted_char = chr((ord(char) - shift + key) % 26 + shift)
            result += encrypted_char  # Append the encrypted character to the result
        else:
            result += char  # Append non-letter characters as they are (e.g., space, punctuation)
    return result  # Return the encrypted text

def decrypt(text, key):
    return encrypt(text, -key)  # Decryption is the same as encryption with the inverse key

def main():
    # Get user input: encryption or decryption
    choice = int(input("Enter 1 for encryption, 2 for decryption: "))

    # Get user input: the text to be encrypted/decrypted
    text = input("Enter the text: ")

    # Get user input: the secret key (a positive integer)
    key = int(input("Enter the key (a positive integer): "))

    if choice == 1:  # If the user chose encryption
        encrypted_text = encrypt(text, key)  # Encrypt the text using the standard alphabet and the key
        print(f"Encrypted text: {encrypted_text}")  # Display the encrypted text
    elif choice == 2:  # If the user chose decryption
        decrypted_text = decrypt(text, key)  # Decrypt the text using the standard alphabet and the key
        print(f"Decrypted text: {decrypted_text}")  # Display the decrypted text
    else:
        print("Invalid choice. Please enter 1 or 2.")  # Display a message for invalid choices

if __name__ == "__main__":
    main()  # Call the main function to start the program
