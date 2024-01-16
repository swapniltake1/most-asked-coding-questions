def is_palindrome(s):
   
    cleaned_s = ''.join(e.lower() for e in s if e.isalnum())
    
   
    return cleaned_s == cleaned_s[::-1]

input_string = "SaaS"
result = is_palindrome(input_string)

print(f'Is "{input_string}" a palindrome? {result}')