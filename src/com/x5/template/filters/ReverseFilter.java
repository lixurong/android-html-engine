package com.x5.template.filters;

import java.util.List;

import com.x5.template.Chunk;

public class ReverseFilter extends SliceFilter
{
    public String getFilterName()
    {
        return "reverse";
    }

    @SuppressWarnings("rawtypes")
    public Object transformList(Chunk chunk, List list, FilterArgs args)
    {
        return super.transformList(chunk, list, new FilterArgs("slice(::-1)"));
    }

}
