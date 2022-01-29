# Manual translation assistant WP Loco Translate V 0.1 (alfa) 
Помощник ручного перевода для плагина к WordPress Loco Translate 

1. Для начала работы необходимо скачать файл для перевод с расширение RU-ru.po

2. Затем вставляете строки для перевода в файл in.txt 
Пример: 

        #: /up-sells.php:12
        msgid "You may also like"
        msgstr ""

        #: /up-sells.php:15
        msgid "Name;"
        msgstr ""

Примечание: строго 3 строчки кода затем пустая строка.

3.Вызываем метод:

        Action in = new Action();
        System.out.println(in.select_replace("in.txt")); 
				
Вернет в терминал только строки для перевода с подменой msgid на msgstr

4. Осуществляем ручной перевод, например через google/translated

      msgid "You may also like"           -> msgstr "Вам также может понравиться"
			
      msgid "Name;"                       -> msgstr "Имя"
			
Строчки перевода добавляем в файл finish.txt (Без лишних пробелов)

5. Вызываем метод


        Action perevod = new Action();
        perevod.input("in.txt", in.read_arr("perevod.txt"));
				
Вернет в терминал переведенный текст для в ставки в файл RU-ru.po

6. Импортируем файл RU-ru.po на сайт

Готово! Сайт переведен!

Pichugin1996!
