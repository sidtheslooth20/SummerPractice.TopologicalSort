package Digraph;

/**
 * Класс вершин
 * Реализованы структура данных и методы для работы с вершинами.
 * Для хранения имени вершины используется поле String name
 * Для хранения индекса(порядка) после сортировки используется поле int sortIndex
 * Для хранения цвета вершины используется VertexColor color, который является классом перечислений enum
 * Для хранения "потомков" используется структура ArrayList<Vertex> vNext
 * Методы:
 *      getName(); addVNext(); removeVNext(); getVNext(); setIndex(); changeColor(); getColor();
 * @author NamYoSeb, Sidtheslooth20
 * @version 1.001
 * P.S.: Есть сомнения с добавлением и удалением элементов, так как про новую версию сборки Java
 * мало доступной информации.
 */

import java.awt.*;
import java.util.*;

public class Vertex {
    /**
     * Поле хранения координат вершины
     */
    private Point point;
    /**
     * Поле хранения имени вершины
     */
    private final String name;

    /**
     * Поле хранения порядка после сортировки
     */
    private int sortIndex;

    /**
     * Поле для цвета вершины
     */
    private Color color;

    /**
     * Поле для хранения потомков
     */
    private final ArrayList<Vertex> vNext;

    /**
     * Поля для хранения координат
     */
    public double x = 0, y = 0;

    /**
     * Конструктор класса
     */
    public Vertex(String name) {
        this.name = name;
        sortIndex = 0;
        point = new Point();
        color = Color.WHITE;
        vNext = new ArrayList<Vertex>();
    }

    public Vertex(int x, int y)
    {
        this.name = "";
        sortIndex = 0;
        point = new Point(x, y);
        color = Color.WHITE;
        vNext = new ArrayList<Vertex>();
    }

    /**
     * Метод получения имени вершины
     */
    public String getName() {
        return name;
    }

    /**
     * Метод добавления потомка вершины
     */
    public void addVNext(Vertex vertex) {
        vNext.add(vertex);
    }

    /**
     * Метод удаления потомка вершины
     */
    public void removeVNext(Vertex vertex) {
        vNext.remove(vertex);
    }

    /**
     * Метод получения списка потомков вершины
     */
    public ArrayList<Vertex> getVNext() {
        return vNext;
    }

    /**
     * Метод присваивания номера порядка вершины
     */


    public void setIndex(int index) {
        sortIndex = index;
    }

    /**
     * Метод, возвращающий текущие координаты
     *
     */
    public Point getPoint() {
        return point;
    }

    /** Метод, возвращающий координаты X */
    public double getX()
    {
        return point.getX();
    }

    /** Метод, возвращающий координаты Y */
    public double getY()
    {
        return point.getY();
    }

    /**
     * Метод, устанавливающий новые координаты
     * @param point новая координата
     */
    public void setPoint(Point point)
    {
        this.x = point.x;
        this.y = point.y;
        this.point = point;
    }

    /**
     * Метод изменения цвета вершины
     */
    public void changeColor()
    {
        if (color == Color.WHITE) color = Color.GRAY;
        color = Color.BLACK;
    }


    /**
     * Метод получения цвета вершины
     */
    public Color getColor()
    {
        return color;
    }
}
