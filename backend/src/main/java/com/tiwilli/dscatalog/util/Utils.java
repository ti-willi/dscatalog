package com.tiwilli.dscatalog.util;

import com.tiwilli.dscatalog.projections.IdProjection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Utils {

    public static <ID> List<? extends IdProjection<ID>> replace(List<? extends IdProjection<ID>> orderesList, List<? extends IdProjection<ID>> unorderedList) {

        Map<ID, IdProjection<ID>> map = new HashMap<>();
        for (IdProjection<ID> obj : unorderedList) {
            map.put(obj.getId(), obj);
        }

        List<IdProjection<ID>> result = new ArrayList<>();
        for (IdProjection<ID> obj : orderesList) {
            result.add(map.get(obj.getId()));
        }

        return result;
    }
}
