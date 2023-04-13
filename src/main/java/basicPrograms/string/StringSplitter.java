package basicPrograms.string;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StringSplitter {
    public static void main(String[] args) {
        String str = "Raghu  |234234234324  |   | 5353| |REG";
        List<String> convertedRankList = Stream.of(str.split("\\|", -1))
                .collect(Collectors.toList());

        for (String convertedRank : convertedRankList) {
            System.out.println(convertedRank.trim());
        }
        // Leads to NumberFormatException
        /*List<Integer> convertedRankList = Stream.of(str.split("|"))
                .map(String::trim)
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        for(Integer convertedRank: convertedRankList){
            System.out.println(convertedRank);*/
    }


}

