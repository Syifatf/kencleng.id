package syifa.app.kcid.network;

import android.telecom.Call;

import syifa.app.kcid.entity.IsiKencleng;
import syifa.app.kcid.entity.Kencleng;

/**
 * Created by USER on 07/01/2019.
 */

public interface Router {

    //    @GET("list.php")
//    public void getMahasiswa;
    @GET("dev/lst_kenclengan")
    Call<IsiKencleng> getKencleng();

//    untuk melakukan post data baru, jika di deskripsikan, berarti:
//

    //    @POST("add.php")
    @POST("dev/insert_kencleng")
    @FormUrlEncoded
    Call<Kencleng> postKenclengan(
            @Field("nominal") String name,
            @Field("catatan") String nim
    );

    @DELETE("nominaltest/{txt_nominal}")
    Call<Kencleng> deleteKenclengan(
            @Path("nominal") int nominal
    );

    @PUT("mahasiswatest/{mhsId}")
    @FormUrlEncoded
    Call<Kencleng> updateKenclengan (
            @Path("nominal") int nominal,
            @Field("catatan") String catatan
    );
}
