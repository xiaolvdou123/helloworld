# -*- coding: utf-8 -*-
"""
Created on Wed September 23 10:01:26 2018
@author: 胡建朗，学号：2017301610104
"""

import hashlib
import base64
import qrcode


print("功能菜单：\n") 
print("输入字符串后输入以下数字指令对字符串进行操作\n")
print("1.对字符串进行sha256加密\n")
print("2.对字符串进行base64编码\n")
print("3.对字符串进行base64解码\n")
print("4.从字符串生成二维码\n")

while(1):

    #输入数字指令并进行判别
    while(1):
        num=int(input("请输入数字指令:\n"))
        if(num==1 or num==2 or num==3 or num==4):
            break
        else:
            print("指令错误，请按照功能菜单的指示输入1到4的整数\n")
    

    ##输入要操作的字符串并判别字符串是否为空
    while(1):
        str1=input('请输入字符串\n')
        if(str1==''):
            print("输入的字符串不能为空，请重新输入\n")
        else:
            break


    str2=str1.encode('utf-8')


    #sha256加密
    if(num==1):
        s=hashlib.sha256(str2).hexdigest()
        print("sha256加密结果是：%s\n"% (s))


    #base64编码
    elif(num==2):
        d=base64.b64encode(str2)
        print("base64编码结果是：%s\n"% (str(d,'utf-8')))

    #base64解码
    elif(num==3):
        e=base64.b64decode(d)
        print("base64解码结果是：%s\n"% (str(e,'utf-8')))

    #生成二维码
    else:
        img=qrcode.make(str(str2))
        img.show()
        print("二维码生成成功\n")



