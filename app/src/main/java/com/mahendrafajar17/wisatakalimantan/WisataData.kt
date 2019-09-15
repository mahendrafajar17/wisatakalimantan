package com.mahendrafajar17.wisatakalimantan

object WisataData{
    private val wisataName = arrayOf(
        "Pasar Terapung Lok Baintan",
        "Bukit Kelam",
        "Sungai Kapuas",
        "Taman Nasional Tanjung Puting",
        "Danau Tahai",
        "Goa Haji Mangku atau Goa Biru",
        "Pulau Pasir Putih, Kepulauan Derawan",
        "Danau Labuan Cermin, Biduk Biduk",
        "Air Terjun Gunung Rian",
        "Long Bawan"
    )

    private val wisataDetails = arrayOf(
        "Pasar yang juga biasa disebut dengan Pasar Terapung Sungai Martapura ini adalah tempat favorit wisatawan menghabiskan waktu. Selain karena keunikannya pasar terapung ini juga bisa jadi spot foto yang keren lho. Kamu juga bisa berinteraksi langsung dengan masyarakat lokal di sini karena berbelanja di pasar terapung adalah salah satu tradisi yang masih terpelihara sampai saat ini. Aktivitas jual beli di Pasar Terapung Lok Baintan ini dimulai sejak pukul 6 pagi hingga 8 pagi.",
        "Gunung batu raksaasa yang ada di Pulau Kalimantan Barat ini juga patut untuk kamu kunjungi. Bukit Kelam yang jadi ikon tempat wisata di Sintang ini sampai saat ini masih menyimpan berbagai misteri. Bongkahan batu raksasa yang monolit ini diklaim sebagai yang terbesar di dunia. Kawasan perbukitan ini menawarkan panorama keindahan alam yang nggak ada duanya. Kamu bisa nih tracking ke atas Bukit Kelam untuk melihat keindahan kota Sintang. Tenang saja kamu bisa dengan nyaman tracking di sini karena sudah disediakan tangga yang mempermudah para pendaki.",
        "Masih ingat pelajaran geografi? Kalau kamu masih mengingatnya pasti kamu ingat dengan Sungai Kapuas. Sungai terpanjang di Indonesia ini juga jadi tempat wisata di Kalimantan yang tidak boleh terlewatkan. Sungai yang menjadi salah satu urat nadi kehidupan masyarakat Pontianak ini memiliki banyak peran. Salah satunya sebagai sarana transportasi yang memudahkan mobilitas warga lokal. Kamu juga bisa lho mencoba menyusuri Sungai Kapuas dan melihat keindahan alamnya.",
        "Nah kalau bicara soal tempat wisata di Pulau Kalimantan, Taman Nasional Tanjung Puting nggak boleh ketinggalan. Taman nasional yang berada di Provinsi Kalimantan Tengah ini menjadi ikon cagar alam dan suaka margasatwa. Berwisata ke sini kamu bisa menikmati hutan tropis khas Kalimantan ditambah dengan kehadiran orang tua yang dijaga di taman nasional ini. Selain bisa melihat orang utan dari jarak yang cukup dekat jika kamu beruntung kamu juga bisa melihat satwa lain seperti beruang, rusa, bekantan, dan kucing liar.",
        "Keindahan Danau Tahai yang berada di Palangkaraya juga harus masuk daftar wisatamu nih. Objek wisata alam yang menawarkan keindahan danau yang masih asri ini memang nggak ada duanya. Kamu yang hobi tracking bisa mengelilingi Danau Tahai dan mengabadikannya. Jika kamu beruntung kamu bisa bertemu hewan khas uwak-uwak sejenis kera yang hidup di sekitar Danau Tahai.",
        "Goa Haji Mangku atau yang dikenal dengan Goa Biru ini punya keindahan yang nggak ada tandingannya. Danau dengan air berwarna biru yang eksotis ini masih terjaga keasriannya. Kalau kamu ingin menyaksikan keindahan alam Goa Haji Mangku berkunjunglah ke Pulau Maratua yang terletak di Kalimantan Timur. Siap-siap dikejutkan dengan keindahannya, ya!",
        "Tempat wisata di Kalimantan yang satu ini disebut sebagai surga tersembunyi di ujung timur Pulau Kalimantan Timur. Pesonanya terbukti telah banyak memikat hati para wisatawan. Di Kepulauan Derawan ini kamu bisa mengeksplorasi beberapa pulau kecil menggunakan kapal. Salah satunya adalah Pulau Gusung yang terkenal dengan pulau dengan pasir putih bersih. Kamu yang hobi foto-foto bisa mendapatkan banyak spot unik.",
        "Danau cantik ini terletak di Kabupaten Berau, Kalimantan Timur. Danau Labuan Cermin menjadi salah satu objek yang sering dikunjungi oleh wisatawan asing maupun lokal. Pemandangan di sekitar Danau Labuan Cermin sangat menenangkan karena dikelilingi rimbunan pohon dan suasana alam yang asri. Tempat ini disebut dengan nama Danau Labuan Cermin karena memiliki permukaan air yang bisa membuat cahaya matahari memantul sehingga terliat sangat jernih.",
        "Wisata nasional Air Terjun Gunung Rian terletak di daerah Desa Safari Rian, Kabupaten Sesayap, Kalimantan Utara. Keindahan air terjun eksotis dengan ketinggian 90 meter ini memikat wisatawan untuk mengunjunginya karena memberikan suguhan alam yang alami dan asri dan sungguh menenangkan hati. memiliki. Untuk bisa ke sini, kamu harus melalui 7 tingkatan yang sangat terjal. Penasaran?",
        "Daerah Pegunungan Long Bawan berada di Desa Krayan, Kabupaten Nunukan. Desa tersembunyi ini tidak bisa diakses melalui jalur darat, hanya bisa melalui jalur udara saja. Tersembunyi di balik gunung-gunung di belantara Kalimantan membuat tempat ini memiliki udara sejuk dan dingin. Di sini, pengunjung dapat melakukan penjelajahan hutan, mengeksplorasi flora dan fauna, menikmati pemandangan sawah serta peternakan kerbau. Uniknya, pengunjung juga bisa menikmati tarian parisanan dan bari tubing yang dimainkan oleh suku Dayak Lundaye yang menempati desa ini."
    )

    private val wisataPhoto = arrayOf(
        R.drawable.wisata1,
        R.drawable.wisata2,
        R.drawable.wisata3,
        R.drawable.wisata4,
        R.drawable.wisata5,
        R.drawable.wisata6,
        R.drawable.wisata7,
        R.drawable.wisata8,
        R.drawable.wisata9,
        R.drawable.wisata10
    )

    val listData: ArrayList<Wisata>
        get() {
            val list = ArrayList<Wisata>()
            for(position in wisataName.indices){
                val wisata = Wisata()
                wisata.photo = wisataPhoto[position]
                wisata.name = wisataName[position]
                wisata.detail = wisataDetails[position]
                list.add(wisata)
            }
            return list
        }
}