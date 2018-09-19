# -*- coding: utf-8 -*-
"""
Created on Wed September 19 11:57:46 2018
@author: 胡建朗，学号：2017301610104
"""

import hashlib
import base64
import qrcode


while(1):

    
    str1=input('请输入字符串\n').encode('utf-8')


    #sha256加密
    s=hashlib.sha256(str1).hexdigest()
    print("sha256加密结果是：%s"% (s))

    #base64加密
    d=base64.b64encode(str1)
    print("base64加密结果是：%s"% (str(d,'utf-8')))

    #base64解密
    e=base64.b64decode(d)
    print("base64解密结果是：%s"% (str(e,'utf-8')))

    #生成二维码
    img=qrcode.make(str(str1))
    img.show()
    print("二维码生成成功")

