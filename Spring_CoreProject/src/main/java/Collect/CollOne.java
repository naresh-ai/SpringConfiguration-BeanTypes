package Collect;

import java.util.List;
import java.util.Map;
import java.util.Properties;
public class CollOne {

        private static List<String> nameList;
        private static Map<String, String> nameMap;
        private static Properties appProperties;

        // Getters and Setters
        public static List<String> getNameList() {
            return nameList;
        }

        public void setNameList(List<String> nameList) {
            this.nameList = nameList;
        }

        public static Map<String, String> getNameMap() {
            return nameMap;
        }

        public void setNameMap(Map<String, String> nameMap) {
            this.nameMap = nameMap;
        }

        public static Properties getAppProperties() {
            return appProperties;
        }

        public void setAppProperties(Properties appProperties) {
            this.appProperties = appProperties;
        }

        @Override
        public String toString() {
            return "CollectionBean{" +
                    "nameList=" + nameList +
                    ", nameMap=" + nameMap +
                    ", appProperties=" + appProperties +
                    '}';
        }
    }


