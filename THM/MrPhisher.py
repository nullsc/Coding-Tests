# Mr. Phisher TryHackMe room
# quick python script to decrypt the phishing email

# encrypted string below
a = [102, 109, 99, 100, 127, 100, 53, 62, 105, 57, 61, 106, 62, 62, 55, 110, 113, 114, 118, 39, 36, 118, 47, 35, 32, 125, 34, 46, 46, 124, 43, 124, 25, 71, 26, 71, 21, 88]

flag = ""
length = len(a)
i = 0
while i < length:
    flag += (chr(a[i] ^ i))
    i = i + 1
    
print(flag)
