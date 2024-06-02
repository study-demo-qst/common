package com.example.common.util;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Base64;

/**
 * 暗号化ユーティリティクラスです。
 */
public class MyCryptoUtil {

    private static final String ALGORITHM = "AES";
    private static final byte[] KEY = "MySuperSecretKey".getBytes();

    /**
     * AESアルゴリズムを使用して、指定された平文を暗号化します。
     *
     * @param plainText 暗号化するテキスト
     * @return 暗号化されたテキスト
     * @throws Exception 暗号化中にエラーが発生した場合
     */
    public static String encrypt(String plainText) throws Exception {
        Cipher cipher = Cipher.getInstance(ALGORITHM);
        SecretKeySpec secretKey = new SecretKeySpec(KEY, ALGORITHM);
        cipher.init(Cipher.ENCRYPT_MODE, secretKey);
        byte[] cipherText = cipher.doFinal(plainText.getBytes());
        return Base64.getEncoder().encodeToString(cipherText);
    }

    /**
     * AESアルゴリズムを使用して、指定された暗号文を復号化します。
     *
     * @param cipherText 復号化するテキスト
     * @return 復号化されたテキスト
     * @throws Exception 復号化中にエラーが発生した場合
     */
    public static String decrypt(String cipherText) throws Exception {
        byte[] bytes = Base64.getDecoder().decode(cipherText);
        Cipher cipher = Cipher.getInstance(ALGORITHM);
        SecretKeySpec secretKey = new SecretKeySpec(KEY, ALGORITHM);
        cipher.init(Cipher.DECRYPT_MODE, secretKey);
        byte[] decryptedText = cipher.doFinal(bytes);
        return new String(decryptedText);
    }
}