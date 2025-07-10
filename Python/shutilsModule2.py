import shutil
import os

os.chdir("./Python")

shutil.copy("shutilsModule.py", "shutilsModule2.py")
shutil.copytree("./clutteredFolder", "mytutorial")
shutil.move("./clutteredFolder/2.png", "2.png")
shutil.rmtree("mytutorial")
os.remove("2.png")