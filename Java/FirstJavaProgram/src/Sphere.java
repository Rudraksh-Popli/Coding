package com.rp.shape;
public class Sphere extends Shape
{
    Sphere(int dim1)
    {
        super(dim1, -1);
    }
    public double area()
    {
        return Math.PI * 4 * this.dim1 * this.dim1;
    }
}