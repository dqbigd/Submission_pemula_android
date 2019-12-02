package dqbigd.com;

import java.util.ArrayList;

public class CryptoData {
    public static String[][] data = new String[][]{
            {"Ripple", "Ripple adalah teknologi yang bertindak sebagai mata uang digital dan jaringan pembayaran digital untuk transaksi keuangan. Ini pertama kali dirilis pada 2012 dan didirikan oleh Chris Larsen dan Jed McCaleb.", "https://cryptocurrencynews.com/wp-content/uploads/sites/3/2018/06/XRP-Logo.png"},
            {"Ethereum", "Ethereum adalah platform komputasi terdistribusi open source, publik, dan sistem operasi terdistribusi yang menampilkan fungsionalitas kontrak pintar. Ini mendukung versi modifikasi dari konsensus Nakamoto melalui transisi negara berbasis transaksi. Ether adalah token yang blockchain-nya dihasilkan oleh platform Ethereum.", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQRTx3F7Pc3DVbwSCBuc2TG7Xi6DRYwQGzz8-v3wm5PP4Gp_cwV"},
            {"Bitcoin", "Bitcoin adalah mata uang pembayaran digital yang menggunakan teknologi cryptocurrency (media pertukaran digital) dan peer-to-peer (P2P) untuk membuat dan mengelola transaksi moneter sebagai lawan dari otoritas pusat. Jaringan open source Bitcoin P2P menciptakan bitcoin dan mengelola semua transaksi bitcoin.", "https://www.dhresource.com/600x600/f2/albu/g9/M00/27/85/rBVaVVxO822ACwv4AALYau1h4a8355.jpg"},
            {"Stellar", "Cryptocurrency, awalnya dikenal sebagai bintang, kemudian disebut Lumens atau XLM. Pada bulan Agustus 2014, Mercado Bitcoin, pertukaran bitcoin Brasil pertama, mengumumkan akan menggunakan jaringan Stellar.", "https://coinnewstelegraph.com/wp-content/uploads/2018/11/stellar-xlm-and-xrp-xrp-are-safe-havens-in-crypto-storm-stellar-lumens-latest-update-xlm-usd-price-today.jpg"},
            {"Cardano", "Cardano adalah proyek blockchain dan cryptocurrency publik terdesentralisasi dan sepenuhnya open source. Cardano sedang mengembangkan platform kontrak pintar yang berupaya menghadirkan fitur-fitur yang lebih canggih daripada protokol apa pun yang dikembangkan sebelumnya. Ini adalah platform blockchain pertama yang berevolusi dari filosofi ilmiah dan pendekatan berbasis riset. Tim pengembangan terdiri dari sekelompok besar global insinyur ahli dan peneliti", "https://miro.medium.com/max/852/1*bzYxka5FGrwtip2Gl2lq5w.jpeg"},
            {"NXT", "Nxt adalah cryptocurrency open source dan jaringan pembayaran diluncurkan pada 2013 oleh pengembang perangkat lunak anonim BCNext. Ia menggunakan bukti kepemilikan untuk mencapai konsensus untuk transaksi — dengan demikian ada pasokan uang statis dan, tidak seperti bitcoin, tidak ada penambangan.", "https://nxtplatform.org/wp-content/themes/nxt_wordpress/images/logo-nxt-rond@2x.png"},
            {"TRON", "Tron adalah platform desentralisasi berbasis-blockchain yang bertujuan untuk membangun sistem hiburan konten digital global yang gratis dengan teknologi penyimpanan terdistribusi, dan memungkinkan berbagi konten digital yang mudah dan hemat biaya.","https://i.pinimg.com/originals/3d/41/fb/3d41fb6d67727a6e03b241f135b3f2dd.jpg"},
            {"SUMOKOIN", "Sumokoin, adalah salah satu aset digital (cryptocurrency) yang dikenal memiliki fitur yang sangat aman dengan tingkatan dalam jangka panjang. Ciri khas dari Sumokoin adalah keamanannya yang terhindar dari hacker atau para peretas dari pihak ketiga","https://s2.coinmarketcap.com/static/img/coins/200x200/1694.png"},
            {"LITECOIN", "Litecoin adalah cryptocurrency peer-to-peer dan proyek perangkat lunak sumber terbuka yang dirilis di bawah lisensi MIT / X11. Pembuatan dan transfer koin didasarkan pada protokol kriptografi open source dan tidak dikelola oleh otoritas pusat. Litecoin adalah spin-off bitcoin atau altcoin awal, dimulai pada Oktober 2011.","https://assets.coingecko.com/coins/images/2/large/litecoin.png?1547033580" },
            {"DOGECOIN", "Dogecoin adalah cryptocurrency yang menampilkan kemiripan dengan anjing Shiba Inu dari meme Internet \"Doge\" sebagai logonya. Diperkenalkan sebagai \"mata uang lelucon\" pada 6 Desember 2013, Dogecoin dengan cepat mengembangkan komunitas online-nya sendiri dan mencapai kapitalisasi US $ 60 juta pada Januari 2014.", "https://cdn.vox-cdn.com/thumbor/G_w4Nyo9IJx5q5xa5E92vJCVyUQ=/21x0:539x345/1200x800/filters:focal(21x0:539x345)/cdn.vox-cdn.com/assets/3727699/Dogecoin_logo.png"}
    };

    public static ArrayList<Crypto> getListData(){
        ArrayList<Crypto> list = new ArrayList<>();
        for (String[] aData : data){
            Crypto crypto =new Crypto();
            crypto.setName(aData[0]);
            crypto.setDetail(aData[1]);
            crypto.setPhoto(aData[2]);

            list.add(crypto);

        }
        return list;

    }

}
