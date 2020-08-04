package paintjob;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println(getBucketCount(3.4,
            2.1,
            1.5,
            2));
        System.out.println(getBucketCount(3.4,
            2.1,
            1.5));
        System.out.println(getBucketCount(3.4,
            1.5));
    }

    public static int getBucketCount(
        double width,
        double height,
        double areaPerBucket,
        int extraBuckets)
    {
        int bucketsToBuy = 0;
        double area = 0;
        if (width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0)
        {
            return -1;
        }
        area = width * height;
        bucketsToBuy = (int) Math.ceil((area / areaPerBucket) - (double) extraBuckets);
        return bucketsToBuy;
    }

    public static int getBucketCount(
        double width,
        double height,
        double areaPerBucket)
    {
        int bucketsToBuy = 0;
        double area = 0;
        if (width <= 0 || height <= 0 || areaPerBucket <= 0)
        {
            return -1;
        }
        area = width * height;
        bucketsToBuy = (int) Math.ceil(area / areaPerBucket);
        return bucketsToBuy;
    }

    public static int getBucketCount(
        double area,
        double areaPerBucket)
    {
        int bucketsToBuy = 0;
        if (area <= 0 || areaPerBucket <= 0)
        {
            return -1;
        }
        bucketsToBuy = (int) Math.ceil(area / areaPerBucket);
        return bucketsToBuy;
    }
}