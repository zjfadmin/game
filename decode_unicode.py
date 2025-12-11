#!/usr/bin/env python
# -*- coding: utf-8 -*-
import re
import os
import sys

def decode_unicode_in_text(text):
    """将文本中的Unicode编码转换为中文"""
    def replace_unicode(match):
        unicode_str = match.group(0)
        try:
            # 解码Unicode字符串
            decoded = unicode_str.encode('utf-8').decode('unicode_escape')
            return decoded
        except:
            return unicode_str
    
    # 匹配 \uXXXX 格式的Unicode编码
    pattern = r'\\u[0-9a-fA-F]{4}'
    result = re.sub(pattern, replace_unicode, text)
    return result

def search_keywords_in_file(filepath, keywords):
    """在文件中搜索关键词"""
    try:
        with open(filepath, 'r', encoding='utf-8') as f:
            content = f.read()
            decoded_content = decode_unicode_in_text(content)
            
            found_keywords = []
            for keyword in keywords:
                if keyword in decoded_content:
                    found_keywords.append(keyword)
            
            if found_keywords:
                return found_keywords
    except Exception as e:
        pass
    return None

# 要搜索的关键词
keywords = ['七十二变', '作坊', '工坊', '生产', '制作', '变身', '36%', '72%']

# 搜索目录
search_dir = r'd:\devop\src\com\xy\a\a'

print("搜索包含以下关键词的文件：", keywords)
print("=" * 80)

# 遍历所有Java文件
for filename in os.listdir(search_dir):
    if filename.endswith('.java'):
        filepath = os.path.join(search_dir, filename)
        found = search_keywords_in_file(filepath, keywords)
        if found:
            print(f"\n文件: {filename}")
            print(f"找到关键词: {', '.join(found)}")
