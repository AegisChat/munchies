package com.atchat;

import software.amazon.awssdk.core.sync.ResponseTransformer;
import software.amazon.awssdk.http.SdkHttpClient;
import software.amazon.awssdk.regions.Region;
import software.amazon.awssdk.services.s3.S3Client;
import software.amazon.awssdk.services.s3.model.GetObjectRequest;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.file.Paths;
import java.util.Random;

public class AmazonS3Helper {

    private final Region region = Region.US_EAST_2;
    private S3Client s3 = S3Client.builder().region(region).build();
    private String bucket = "menu-item.munchies.restaurant";

    public void test() throws Exception {
        s3.getObject(GetObjectRequest.builder().key("foo.txt").bucket(bucket).build(), ResponseTransformer.toFile(Paths.get(System.getProperty("user.dir")+"/foo.txt")));
    }


    private static ByteBuffer getRandomByteBuffer(int size) throws IOException {
        byte[] b = new byte[size];
        new Random().nextBytes(b);
        return ByteBuffer.wrap(b);
    }
}
