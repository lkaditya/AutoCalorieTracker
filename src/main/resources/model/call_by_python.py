#!/usr/bin/env python
# coding: utf-8

# In[5]:


from tensorflow.keras.models import load_model
from numpy import asarray
import numpy as np
import sys
from PIL import Image



img_path = sys.argv[1]
modelpath= sys.argv[2]

# img_path = './data/test/hamburger/1.jpeg'

def predict(img_path,modelpath):
    model = load_model(modelpath)
    food_list = ['hamburger','pizza','omelette','fish and chips','chicken curry']
    img = Image.open(img_path)
    img = img.resize((299, 299))
    img = asarray(img)  
    img = np.expand_dims(img, axis=0)         
    img = img / 255
    pred = model.predict(img)
    index = np.argmax(pred)
    food_list.sort()
    pred_value = food_list[index]
    print(pred_value)
    
predict(img_path,modelpath)

