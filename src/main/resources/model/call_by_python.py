#!/usr/bin/env python
# coding: utf-8

# In[5]:


from tensorflow.keras.models import load_model
from numpy import asarray
import numpy as np
import sys
from PIL import Image
import tensorflow.keras.backend as K
from time import process_time 

start = process_time()
img_path = sys.argv[1]
modelpath= sys.argv[2]

# img_path = './data/test/hamburger/1.jpeg'
# call_by_python.py ./data/test/hamburger/1.jpeg m5.h5

def predict(img_path,modelpath):
    K.clear_session()
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
end = process_time()
print('Running time: %s Seconds'%(end-start))