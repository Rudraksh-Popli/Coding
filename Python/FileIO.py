import os
os.chdir("Python")

# READING A FILE

# f = open('myfile1.txt', 'r')
# # print(f)
# text = f.read()
# print(text)
# f.close()

# WRITING A FILE

# f = open('myfile1.txt', 'a')
# f.write('Hello, world!')
# f.close()

# with open('myfile1.txt', 'a') as f:
#   f.write("Hey I am inside with")

# with open('myfile1.txt', 'r') as f:
#   print(f.read())

# f = open('myfile.txt', 'r')
# i = 0
# while True:
#   i = i + 1
#   line = f.readline()
#   if not line:
#     break
#   m1 = int(line.split(",")[0])
#   m2 = int(line.split(",")[1])
#   m3 = int(line.split(",")[2])
#   print(f"Marks of student {i} in Maths is: {m1*2}")
#   print(f"Marks of student {i} in English is: {m2*2}")
#   print(f"Marks of student {i} in SST is: {m3*2}")

#   print(line)

# f = open('myfile2.txt', 'w')
# lines = ['line 1\n', 'line 2\n', 'line 3\n']
# f.writelines(lines)
# f.close()

# f = open('myfile3.txt', 'w')
# lines = ['line 1', 'line 2', 'line 3']
# for line in lines:
#     f.write(line + '\n')
# f.close()

with open('file.txt', 'r') as f:
  # Move to the 10th byte in the file
  f.seek(10)
  # Read the next 5 bytes
  data = f.read(5)
  print(data)

with open('file.txt', 'r') as f:
  # Read the first 10 bytes
  data = f.read(10)
  print(data)
  # Save the current position
  current_position = f.tell()
  # Seek to the saved position
  f.seek(current_position)
  data = f.read(5)
  print(data)

with open('sample.txt', 'w') as f:
  f.write('Hello World3!')
  f.truncate(3)

with open('sample.txt', 'r') as f:
  print(f.read())