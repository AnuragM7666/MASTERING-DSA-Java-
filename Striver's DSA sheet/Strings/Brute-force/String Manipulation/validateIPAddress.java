public class validateIPAddress {
    public boolean isV4(String IP){
        String[] ips=IP.split("\\.",-1);
        if(ips.length!=4) return false;

        for(String ip:ips){
            for(char c:ip.toCharArray()){
                if(!Character.isDigit(c)) return false;
            }
            if(ip.length()==0 || ip.length()>3) return false;
            if(ip.length()>1 && ip.charAt(0)=='0') return false;

            int num=Integer.parseInt(ip);
            if(num<0 || num>255) return false;
        }
        return true;
    }
    public boolean isV6(String IP){
        String[] ips=IP.split(":",-1);
        if(ips.length!=8) return false;

        for(String ip:ips){
            if(ip.length()==0 || ip.length()>4) return false;

            for(char c:ip.toCharArray()){
                if((!Character.isDigit(c)) && !(c>='a' && c<='f') && !(c>='A' && c<='F')){
                    return false;
                }
            }
        }
        return true;
    }
    public String validateIP(String s){
        if(isV4(s)){
            return "IPv4";
        }else if(isV6(s)){
            return "IPv6";
        }else{
            return "Neither";
        }
    }
    public static void main(String[] args) {
        validateIPAddress validator = new validateIPAddress();
        System.out.println("172.16.254.1 -> " + validator.validateIP("172.16.254.1")); // Should return "IPv4"
        System.out.println("2001:0db8:85a3:0:0:8A2E:0370:7334 -> " + validator.validateIP("2001:0db8:85a3:0:0:8A2E:0370:7334")); // Should return "IPv6"
       
        System.out.println("Empty string -> " + validator.validateIP("")); // Should return "Neither"
      
    }
}
