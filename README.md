<h1>Абстрактный суперкласс</h1>
<h2>Функциональное назначение</h2>
Данная программа реализует иерархию для отображения фигур и позволяет отобразить указанную на кнопку пользовательского интерфейса фигуру.

<h2>Используемый паттерн</h2>
<b>Абстрактный суперкласс.</b> Класс, выступающий в этой роли, представляет собой абст­рактный суперкласс, в котором инкапсулирована общая логика связанных клас­сов.
Связанные классы расширяют этот класс. Таким образом, они могут на­следовать его методы.
Методы с одинаковыми сигнатурами и общей логикой для всех связанных классов помещаются в суперкласс,
поэтому логика этих ме­тодов может наследоваться всеми подклассами данного суперкласса.
Методы с зависящей от конкретного подкласса данного суперкласса логикой, но с оди­наковыми сигнатурами,
объявляются в абстрактном классе как абстрактные методы, тем самым гарантируя, что каждый конкретный подкласс будет иметь методы с такими же сигнатурами.
<h2>Интерфейс программы</h2>
<img src="https://i.ibb.co/4spVG5t/2.png">
