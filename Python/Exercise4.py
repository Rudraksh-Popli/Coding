# Write a python program to translate a message into secret code language. Use the rules below to translate normal English into secret code language

# Coding:
# if the word contains atleast 3 characters, remove the first letter and append it at the end
#   now append three random characters at the starting and the end
# else:
#   simply reverse the string

# Decoding:
# if the word contains less than 3 characters, reverse it
# else:
#   remove 3 random characters from start and end. Now remove the last letter and append it to the beginning

# Your program should ask whether you want to code or decode

import random
import string

choice = input("Do you wish to decode or encode : ")
if choice.lower() == "encode":
    wordToEncode = input("Enter word to encode : ")
    wordToEncodeList = list(wordToEncode.lower())
    if len(wordToEncode) <= 3:
        wordToEncodeList.reverse()
        for i in wordToEncodeList:
            print(i,end="")
    else:
        firstWord = wordToEncodeList.pop(0)
        randomString = ''.join(random.choices(string.ascii_lowercase, k=3))
        wordToEncodeList.extend([firstWord,randomString])
        randomString = ''.join(random.choices(string.ascii_lowercase, k=3))
        wordToEncodeList.insert(0,randomString)
        for i in wordToEncodeList:
            print(i,end="")
if choice.lower() == "decode":
    wordToDecode = input("Enter word to decode : ")
    wordToDecodeList = list(wordToDecode.lower())
    if len(wordToDecode) <= 3:
        wordToDecodeList.reverse()
        for i in wordToDecodeList:
            print(i,end="")
    else:
        for i in range(3):
            wordToDecodeList.pop()
        for i in range(3):
            wordToDecodeList[i] = ''
        firstWord = wordToDecodeList.pop()
        wordToDecodeList.insert(0,firstWord)
        for i in wordToDecodeList:
            print(i,end="")

# 2.
# st = input("Enter message")
# words = st.split(" ")
# coding = input("1 for Coding or 0 for Decoding")
# coding = True if (coding=="1") else False
# print(coding)
# if(coding):
#   nwords = []
#   for word in words:
#     if(len(word)>=3):
#       r1 = "dsf"
#       r2 = "jkr"
#       stnew = r1+ word[1:] + word[0] + r2
#       nwords.append(stnew)
#     else:
#       nwords.append(word[::-1])
#   print(" ".join(nwords))

# else:
#   nwords = []
#   for word in words:
#     if(len(word)>=3): 
#       stnew = word[3:-3]
#       stnew = stnew[-1] + stnew[:-1]
#       nwords.append(stnew)
#     else:
#       nwords.append(word[::-1])
#   print(" ".join(nwords))