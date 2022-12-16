package com.ikapurwanti.proyekakhir_ikapurwanti

object ProdukData {

    private val produkGambar = intArrayOf(R.drawable.facial_wash,
        R.drawable.mois_ceramide,
        R.drawable.mois_bright,
        R.drawable.toner_smoot,
        R.drawable.toner_acid,
        R.drawable.volcano,
        R.drawable.cushion,
        R.drawable.serum_niacin,
        R.drawable.acne_treatment,
        R.drawable.toner_eksfo,
        R.drawable.mugwort,
        R.drawable.sunscreen_spray,
        R.drawable.serum_ceramide)

    private val produkNames = arrayOf ( "5X Ceramide Facial Wash",
            "5X Ceramide Moisturize",
            "MHS Niacinamide Moisturize",
            "5X Ceramide Soothing Toner",
            "Glycolic Acid Toner",
            "Alaska Volcano Clay Mask",
            "Cushion High Coverage",
            "Serum Niacinamide 10%",
            "Acne Treatment",
            "Toner Face Eksfoliasi",
            "Mugwort Acne Clay Mask",
            "Sunscreen Mist SPF50 PA++++",
            "Serum 5x Ceramide")

    private val produkHarga = arrayOf(
            "Rp. 94.000",
            "Rp. 129.000",
            "Rp. 129.000",
            "Rp. 97.000",
            "Rp. 109.000",
            "Rp. 89.000",
            "Rp. 179.000",
            "Rp. 119.000",
            "Rp. 97.000",
            "Rp. 109.000",
            "Rp. 89.000",
            "Rp. 79.000",
            "Rp. 119.000"
    )

    private val produkDetail = arrayOf("5x Ceramide Cleanse with Moist Barrier Protection",
            "5X Ceramide Menghidrasi dan Melembabkan",
            "MSH Niacinamide Tampak Lebih Cerah dalam 14 Hari",
            "5X Ceramide Emergency Soothing",
            "Glycolic Acid Bersihkan Pori Kulit halus bercahaya",
            "Alaska Volcano Clay Pore-Detoxing And Blackheads Buster",
            "Flawless Skin Perfectly Cover & Long-Lasting",
            "10% Niacinamide Niacinamide Dengan Efek Tercepat",
            "BHA Salicylic Acid Meredakan Jerawat Mencegah Bekas Jerawat",
            "5% AHA BHA PHA Mendetoks & Mencerahkan Kulit Wajah Dengan Lembut",
            "Mugwort Clay Mask Menenangkan Jerawat, Membersihkan Pori-pori",
            "SPF 50 PA++++ Perlindungan Tak Kasat Mata dari Sinar Matahari Setiap Saat",
            "5X Ceramide Ultimate Repair Damaged Skin Barrier")

    private val produkDeskripsi = arrayOf(
        "Skintific 5X Ceramide Low pH Cleanse\nPembersih wajah pH balanced (5.5~6) andalan untuk kulit sensitif karena menggunakan 5 tipe Ceramides untuk membersihkan wajah secara keseluruhan tapi tetap menjaga kelembaban dan mengembalikan kesehatan skin barrier. Menggunakan Amino Acid sebagai alternatif yang lebih aman untuk menghasilkan busa halus, kulit akan terhindar dari iritasi, rasa kering dan ketarik setelah mencuci muka. Busa halus dan lembut yang dihasilkan adalah hasil dari teknologi micro foaming yang bisa membersihkan wajah hingga kedalam pori- pori. Ditambah kandungan active ingredients tambahan seperti Niacinamide dan Hyaluronic Acid, cleanser ini juga dapat membersihkan kulit agar terlihat lebih cerah, mengontrol produksi minyak berlebih, mengatasi kulit meradang akibat jerawat dan menjaga kelembaban natural kulit.",
        "SKINTIFIC 5X Ceramide Barrier Repair Moisture Gel",
        "Skintific MSH Niacinamide Brightening Moisture Gel\nMSH Niacinamide Brightening Moisture Gel dengan tekstur seringan udara, dapat menyerap dengan cepat dan mengontrol minyak dalam 24 jam. Diformulasikan dengan Novel MSH Niacinamide ekslusif SKINTIFIC yang dikombinasikan dengan dua bahan pencerah yang ringan dan paling efektif yaitu Alpha Arbutin dan Tranexamic Acid, yang mampu mencerahkan dengan signifikan dalam waktu 14 hari. MSH Niacinamide terbukti secara klinis 10 kali lebih efektif dibandingkan niacinamide biasa dalam mengurangi hiperpigmentasi, meredakan kemerahan dan memperbaiki elastisitas kulit. Diperkaya dengan Centella Asiatica dan 5X Ceramide, tidak menyebabkan iritasi serta memberikan efek menenangkan kulit sekaligus memperbaiki dan menjaga skin barrier.",
        "SKINTIFIC 5X Ceramide Soothing Toner 80ml\n Toner yang dapat digunakan sehari-hari untuk menenangkan kulit saat skin barrier sedang terganggu, membantu proses perbaikan skin barrier dan menjaga kulit agar tetap sehat.\n Memiliki kandungan 5 jenis Ceramide yang berbeda yang baik untuk menjaga barier kulit, ditambah kandungan probiotik kompleks yang dapat meningkatkan sel mikrobioma kulit untuk mengurangi permasalahan kulit, dan juga kandungan Calendula yang memiliki fungsi anti inflamasi, dan antibakteri sehingga bisa melindungi collagen alami kulit agar kulit terlihat lebih kenyal dan sehat ",
        "Skintific Glycolic Acid Daily Clarifying Toner\nToner eksfoliasi ringan yang diformulasikan aman untuk digunakan setiap hari. Mengandung Glycolic Acid kualitas terbaik untuk membantu mencerahkan kulit. Kandungan Glycolic Acid membantu melawan jerawat dan beruntusan yang muncul pada kulit wajah. Didukung dengan kandungan Niacinamide dan Lactobionic Acid untuk mendorong efektifitas untuk mengurangi tampilan pori-pori, menjadikan kulit bercahaya dan halus. Dilengkapi dengan kandungan 5X Ceramides untuk menjaga dan memperbaiki skin barrier",
        "Clay mask yang membersihkan pori secara mendalam dan menghempaskan komedo. Mengandung partikel halus dari Alaska Volcano Clay yang dapat secara alami mengeksfoliasi dan mendetoks kulit wajah. Dilengkapi dengan Glycolic Acid dan Probiotics untuk menjaga skin barrier serta meregenerasi kulit. Kekuatan pembersihan mendalam, menghempaskan komedo dalam 10 menit dan mengencangkan tampilan pori. Tekstur yang lembut dan mudah diaplikasikan tanpa menyebabkan sensasi kulit tertarik atau kencang. ",
        "Skintific Cover All Perfect Cushion\nCover All Perfect Cushion dengan hasil akhir sempurna dalam 1 kali pat, menggunakan Nano Silicone Crosspolymer 0.25 micron, memberikan coverage tinggi dan hasil akhir yang flawless. Dengan Raincoat Protective Film Technology, menutup air dan minyak, tahan hingga 12 jam untuk mencegah kusam dan warna tidak merata. Mengandung serum ingredients seperti 5X Ceramide, Centella and Hyaluronic Acid, yang memelihara, melembabkan, dan menguatkan skin barrier. Perlindungan ganda dari sinar matahari dengan physicochemically combined sunscreen, mengandung SPF 35 PA++++ untuk melindungi kulit dari bahaya sinar UV. Rubycell Puff Technology dengan teardrop shape, lubang udara yang rapat untuk menciptakan hasil akhir halus, merata dan sempurna. Medium to full coverage, tekstur ringan dan memberikan efek segar dan terhidrasi tahan lama pada kulit. Tersedia dalam 5 pilihan warna : Vanilla, Ivory, Petal, Beige, Sand, dengan kemasan double mirrored yang travel friendly, dengan ketebalan kurang dari 2 cm.",
        "SKINTIFIC 10% NIACINAMIDE WHITENING GLOWING SKIN SERUM\nSerum pencerah yang mengandung 10% Niacinamide, yang sama dengan niacinamide pada SK-II, Arbutin, Ceramide, and Centella Asiatica. Dapat mencerahkan dengan cepat, menghilangkan bekas jerawat dan bekas terbakar sinar matahari dalam 7 hari. Niacinamide yang digunakan adalah Niacinamide paling terbaik di dunia, Royal DSM Niacinamide, yang dapat melindungi skin barrier dan mencerahkan secara mendalam. ",
        "SKINTIFIC Salicylic Acid BHA Acne Spot treatment",
        "SKINTIFIC 5% AHA BHA PHA Exfoliating Toner \nKulit bersih dan tampak lebih bersinar dengan Skintific 5% AHA BHA PHA Exfoliating toner. Perpaduan acid yang baik untuk kulit dan Kompleks Probiotik, bekerja sama untuk menghilangkan kotoran, sebum dan sel kulit mati, juga memperbaiki tekstur kulit kasar, dan kulit yang kusam. Kompleks Probiotik juga menyeimbangkan mikrobioma kulit, memperkuat barrier kulit, mengatasi dan mencegah jerawat & beruntusan untuk kulit yang tampak lebih glowing & cerah. Bahan ini juga digunakan oleh SKII Facial Treatment Essence dan disebut sebagai “PITERA” oleh SKII, terbukti secara ilmiah bahan yang efektif untuk membuat kulit lebih sehat dan kuat",
        "SKINTIFIC Mugwort Anti Acne Clay Mask mengandung ekstrak Mugwort dengan kualitas terbaik untuk melawan breakout agar kulit lebih cerah dan ceria. ",
        "Skintific All Day Light Sunscreen Mist\nSunscreen mist dengan 0.01nm spray yang halus, mudah dibawa dan tidak merusak makeup pada saat diaplikasikan. Tekstur yang invisible, tidak terasa berat dan menyegarkan kulit. Memberikan rasa segar pada kulit saat digunakan. Perlindungan maksimal dengan SPF 50+ PA++++, 12 jam melindungi dari UVB penyebab sunburn dan 16 x menangkal UVA untuk mencegah tanda penuaan akibat paparan sinar matahari. Teknologi mikrokapsul, memberikan 0.04nm lapisan pelindung transparan pada kulit wajah. Dilengkapi 5X bahan efektif termasuk UV Pearls, Ceramide dan Centella yang melindungi 99% dari bahaya sinar UV, tanda penuaan serta kulit terbakar matahari.",
        "SKINTIFIC 5X Ceramide Barrier Repair Serum 20ml\nSerum yang diformulasikan untuk mengoptimalkan perbaikan skin barrier yang rusak.\n 5 Jenis Ceramide yang berbeda untuk menjaga dan mengembalikan kondisi skin barrier agar kembali sehat. Ditambah kandungan BFL probiotik yang dapat mencegah dan merawat inflamasi ataupun permasalahan kulit seperti kemerahan dan jerawat. Untuk kondisi skin barrier yang terganggu, kandungan Centella Asiatica pada serum ini juga dapat menenangkan dan mempercepat penyembuhan kulit."
    )

    private val produkManfaat = arrayOf(
            "- Membersihkan kulit dengan lembab, tanpa membuat kulit kering & ketarik\n- Menenangkan kulit\n- Memelihara & mengembalikan kesehatan skin barrier, sehingga mencegah dari masalah kulit seperti jerawat\n- Menjaga hidrasi dan kelembapan kulit\n- Menjadikan kulit lebih halus & tampak lebih cerah",
            "- Mengembalikan dan menciptakan perlindungan skin barrier\n- Menghidrasi kulit secara instan dan memperbaiki sel kulit terdalam secara intensif\n- Menenangkan dan memperbaiki inflamasi pada kulit",
            "- Mencerahkan warna kulit secara signifikan dalam 14 hari\n- Meredakan kemerahan pada kulit\n- Mengurangi hiperpigmentasi\n- Memperbaiki elastisitas kulit wajah \n- Menenangkan kulit dan menjaga skin barrier",
            "- Toner yang bisa memberikan solusi instan untuk menenangkan kulit\n- Memperbaiki skin barrier yang terganggu \n- Mengurangi kemerahan, sensitif, dan membantu kulit berjerawat \n- Menjaga kulit agar tetap terhidrasi dan terjauh dari permasalahan kulit \n- Memperbaiki sel kulit agar lebih sehat dan kenyal",
            "- Melawan jerawat dan beruntusan  \n- Mengangkat sel kulit mati dengan lembut\n- Mengurangi tampilan pori-pori \n- Menjaga dan memperbaiki skin barrier\n- Menjadikan kulit lebih halus & tampak lebih cerah",
            "- Membersihkan pori secara mendalam dan lembut  \n- Mengurangi tampilan blackhead dan whitehead\n- Mengeksfoliasi dan mendetoks kulit wajah tanpa iritasi\n- Menjaga dan memperbaiki skin barrier\n- Menjadikan kulit lebih halus & bersih",
            "- Menutup noda dan flaws di wajah dalam 1 kali pat\n- Melindungi dari sinar UV dengan SPF 35 PA++++\n- Menahan minyak di wajah hingga 12 jam dengan Raincoat Film Technology\n- Memelihara dan menguatkan skin barrier dengan kandungan Ceramide, Centella dan Hyaluronic Acid ",
            "- Mencerahkan dan membuat kulit bersinar\n- Menyamarkan noda hitam\n- Menyamarkan tanda bekas jerawat\n- Menghaluskan dan meratakan warna kulit\n- Memperbaiki skin barrier \n- Mengontrol minyak dan melembabkan\n- Mengecilkan pori-pori ",
            "- Meredakan jerawat\n- Mencegah bekas jerawat",
            "- Meredakan beruntusan & jerawat dengan cepat\n- Membersihkan pori-pori & mengangkat sel kulit mati, membuat kulit lebih halus\n- Menghilangkan blackhead dan whitehead\n- Memperbarui sel-sel kulit dan mengurangi garis halus\n- Mengembalikan fungsi alami kulit, dan membuat kulit lebih cerah",
            "- Menenagkan jerawat\n- Menghilangkan bruntusan\n- Deep cleansing",
            "- Melindungi kulit dari paparan UVA UVB \n- Memproteksi tanpa rasa greasy dan tanpa merusak makeup\n- Menjadikan kulit terasa segar setelah diaplikasikan\n- Menangkal sunburn dan mencegah tanda penuaan\n- Tanpa whitecast dan travel-friendly",
            "- Memperbaiki dan menjaga skin barrier yang rusak \n- Meredakan dan menenangkan permasalahan kulit (kemerahan, sensitif, jerawat) \n- Meratakan kulit bertekstur menjadi lebih halus \n- Mengurangi permasalahan kulit yang disebabkan oleh kerusakan skin barrier\n- Mencegah kulit sensitif, peradangan kulit, dan jerawat "
    )

    private val produkCarapakai = arrayOf(
        "Tuangkan cleanser secukupnya, gunakan pada wajah yang basah, pijat lembut kulit dengan gerakan memutar hingga membentuk busa lembut, hindari produk masuk ke mata. Bilas secara menyeluruh dan keringkan dengan lembut. Dapat digunakan pagi dan malam.",
        "Oleskan pelembab sebesar anggur pada pipi, jidat, hidung, dan dagu.",
        "Ambil produk secukupnya dan oleskan pada kulit wajah secara merata. Dapat digunakan pagi dan malam hari. ",
        "1. Gunakan saat kulit dalam keadaan bersih \n2. Bisa menggunakan kapas atau langsung diteteskan ke tangan \n3. Usapkan atau tepuk secara lembut ke seluruh permukaan wajah, jika ingin sampai ke leher \n4. Gunakan 1-2x dalam sehari, setelah toner dapat dilanjutkan ke rutinitas skincare selanjutnya ",
        "Gunakan secukupnya menggunakan kapas halus, gosokkan pada area wajah secara merata dan lembut. Dapat digunakan setiap hari, pada malam hari.  ",
        "1. Aplikasikan lapisan tipis Clay Mask pada kulit bersih, hindari area mata. \n2. Tunggu 10-15 menit dan bilas hingga bersih dengan air hangat. \n3. Gunakan 2-3 kali dalam seminggu untuk hasil terbaik.  ",
        "1. Buka penutup cushion dan lepaskan stiker pelindung \n2. Ambil secukupnya dengan menekan spons pada bagian dalam\n3. Tap ke seluruh wajah \n4. Tutup cushion apabila telah selesai digunakan agar tidak kering",
        "1. Oleskan beberapa tetes ke area wajah dan leher yang bersih sebelum menggunakan pelembab.\n2. Untuk hasil yang optimal, gunakan pada pagi dan malam hari.\n3. Untuk pagi hari, akhiri dengan penggunaan sunscreen.",
        "1. Dapat digunakan pada pagi & malam hari sebagai step terakhir skincare di area yang berjerawat saja. \n2. Jangan dibilas, dibiarkan sampai obat meresap kedalam kulit.",
        "1. Gunakan 2-3 kali/minggu, jika kamu baru menggunakan toner eksfoliasi.  Disarankan menggunakan kapas.\n2. Gunakan tabir surya jika menggunakan toner eksfoliasi di siang hari.\n3. Tingkatkan frekuensi penggunaan sehari-hari, ketika sudah terbiasa dengan toner eksfoliasi.",
        "1. Aplikasikan lapisan tipis Clay Mask pada kulit bersih, hindari area mata. \n2. Tunggu 10-15 menit dan bilas hingga bersih dengan air hangat. \n3. Gunakan 2-3 kali dalam seminggu untuk hasil terbaik.",
        "Semprotkan ke area yang diinginkan dengan jarak sekitar 20cm, kemudian tepuk perlahan agar lebih meresap. Dapat dilakukan berulang kali sesuai kebutuhan.",
        "1. Gunakan pada kondisi wajah yang bersih\n2. Teteskan beberapa tetes ke tangan \n3. Usapkan pada wajah secara merata, bisa diusap ke bagian leher \n4. Biarkan serum meresap pada kulit secara optimal \n5. Untuk hasil yang lebih baik, serum dapat digunakan siang dan malam hari \n6. Pengunaan di pagi hari sebaiknya diakhiri dengan penggunaan sunscreen "
    )

    private val produkUkuran = arrayOf(
        "80 ml",
        "30 gr",
        "30 gr",
        "80 ml",
        "80 ml",
        "55 gr",
        "11 ml",
        "20 ml",
        "10 gr",
        "80 ml",
        "55 gr",
        "50 ml",
        "20 ml"
    )


    val listDataProduk: ArrayList<Produk>
        get() {
            val list = arrayListOf<Produk>()
            for (position in produkNames.indices) {
                val produk = Produk()
                produk.gambar = produkGambar[position]
                produk.nama = produkNames[position]
                produk.harga = produkHarga[position]
                produk.detail = produkDetail[position]
                produk.deskripsi = produkDeskripsi[position]
                produk.manfaat = produkManfaat[position]
                produk.cara = produkCarapakai[position]
                produk.ukuran = produkUkuran[position]
                list.add(produk)
            }
            return list
        }
}