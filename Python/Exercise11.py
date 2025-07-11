# Write a python program which reminds you of drinking water every hour or two.
# Your program can either beep or send desktop notifications for a specific operating system

import time
from win10toast import ToastNotifier
import datetime


def getTimeInput():
    hour = int(input("Hours of interval : "))
    minutes = int(input("Minutes of interval : "))
    seconds = int(input("Seconds of interval : "))
    time_interval = seconds+(minutes*60)+(hour*3600)
    return time_interval


def log():
    now = datetime.datetime.now()
    start_time = now.strftime("%H:%M:%S")
    with open("log.txt", 'a') as f:
        f.write(f"You drank water {now} \n")
    return 0


def notify():
    notification = ToastNotifier()
    notification.show_toast("Time to drink water")
    log()
    return 0


def starttime(time_interval):
    while True:
        time.sleep(time_interval)
        notify()


if __name__ == '__main__':
    time_interval = getTimeInput()
    starttime(time_interval)