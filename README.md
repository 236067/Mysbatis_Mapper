# Mysbatis_Mapper
mapper代理练习


这里要注意只有package里的文件写地址时可以用 . 来索引，在包里的文件索引地址的时候要用 / ，其次索引同一包下的文件时相同地址部分可以不写， String resource = "m.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);这里 索引核心配置文件直接写文件名不是地址，映射文件下的命名空间应该对应的是mapper代理的那个接口的地址
